package closure;

public class MediaTeste {
    public static void main(String[] args) {
        IMedia media = (n1, n2)
                -> (n1+n2)/2;

        System.out.println(
                media.concat(5, 6));
    }
}
