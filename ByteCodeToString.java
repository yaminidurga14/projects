import java.nio.charset.StandardCharsets;

public class ByteCodeToString {
    public static void main(String[] args) {
        byte[] byteArray={14,9,22,108,11,111,2};
        String str=new String(byteArray,StandardCharsets.UTF_8);
        System.out.println(str);

    }
}
