public class StringLiterals {
    // Demonstrates escape sequences in strings.
    public static void main(String[] args) {
        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
    }
    /*
        Escape Sequence         Description
        ---------------         -----------
        \'                      Single Quote
        \"                      Double Quote
        \\                      Backslash
        \r                      Carriage Return
        \n                      New line
        \f                      Form feed
        \t                      Horizontal tab
        \b                      Backspace
        \ddd                    Octal Constant (where ddd is an octal constant)
        \ u xxxx                  Hexadecimal constant (where xxxx is a hexadecimal constant)
     */
}
