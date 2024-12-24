import java.io.*;
import java.net.*;

public class Main {
    private static final int PORT = 3131;
    private static final String STUDENT_INFO = "Tulyasheva Arina Timurovna";

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Calculator HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        String line = in.readLine();
        if (line == null) return;

        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        String path = requestParts[1];

        if (method.equals("GET")) {
            if (path.startsWith("/calculate")) {
                handleCalculateRequest(path, out);
            } else if (path.equals("/student_info")) {
                handleStudentInfoRequest(out);
            } else {
                handleNotFound(out);
            }
        }
        out.flush();
    }

    private static void handleCalculateRequest(String path, PrintWriter out) {
        try {
            String query = path.split("\\?")[1];
            String[] params = query.split("&");
            double a = 0, b = 0;
            String operation = "";

            for (String param : params) {
                String[] keyValue = param.split("=");
                if (keyValue[0].equals("a")) {
                    a = Double.parseDouble(keyValue[1]);
                } else if (keyValue[0].equals("b")) {
                    b = Double.parseDouble(keyValue[1]);
                } else if (keyValue[0].equals("op")) {
                    operation = keyValue[1];
                }
            }
            double result = calculate(a, b, operation);
            sendHttpResponse(out, 200, String.valueOf(result));
        } catch (NumberFormatException e) {
            sendHttpResponse(out, 400, "Invalid number format.");
        } catch (ArithmeticException e) {
            sendHttpResponse(out, 400, e.getMessage());
        } catch (Exception e) {
            sendHttpResponse(out, 400, "Bad request.");
        }
    }

    private static void handleStudentInfoRequest(PrintWriter out) {
        sendHttpResponse(out, 200, STUDENT_INFO);
    }

    private static double calculate(double a, double b, String operation) throws ArithmeticException {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero is not allowed. HTTP 400");
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation.");
        }
    }

    private static void handleNotFound(PrintWriter out) {
        sendHttpResponse(out, 404, "404 Not Found");
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String body) {
        System.out.println("Sending HTTP response:");
        System.out.println("HTTP/1.1 " + statusCode + " OK");
        System.out.println("Content-Type: text/plain");
        System.out.println("Content-Length: " + body.length());
        System.out.println();
        System.out.println(body);

        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/plain");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
    }
}