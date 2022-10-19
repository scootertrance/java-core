import java.io.*;

class QuestionAnswer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("You are " + answer);
    }
}
