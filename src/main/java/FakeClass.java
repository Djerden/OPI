public class FakeClass {
    // Текстовые переменные для различных сообщений об ошибках
    private String fileNotFound = "Error: The specified file was not found.";
    private String accessDenied = "Error: Access to the resource is denied.";
    private String invalidInput = "Error: The input provided is invalid.";
    private String connectionFailed = "Error: Failed to establish a connection.";
    private String operationTimeout = "Error: The operation has timed out.";
    private String unknownError = "Error: An unknown error has occurred.";

    // Методы для получения сообщений об ошибках

    public String getFileNotFoundMessage() {
        return fileNotFound;
    }

    public String getAccessDeniedMessage() {
        return accessDenied;
    }

    public String getInvalidInputMessage() {
        return invalidInput;
    }

    public String getConnectionFailedMessage() {
        return connectionFailed;
    }

    public String getOperationTimeoutMessage() {
        return operationTimeout;
    }

    public String getUnknownErrorMessage() {
        return unknownError;
    }
}
