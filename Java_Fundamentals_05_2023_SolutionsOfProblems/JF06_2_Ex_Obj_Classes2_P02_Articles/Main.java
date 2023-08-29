package JF06_2_Ex_Obj_Classes2_P02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineData=scanner.nextLine();
        Article article=new Article(lineData.split(", ")[0],
                lineData.split(", ")[1],lineData.split(", ")[2]);

        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            lineData=scanner.nextLine();

            switch (lineData.split(": ")[0]){
                case "Edit":
                    article.edit(lineData.split(": ")[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(lineData.split(": ")[1]);
                    break;
                case "Rename":
                    article.rename(lineData.split(": ")[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
