package ObjectAndClasses_exam;

import java.util.Scanner;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles(String title,String content,String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void Edit(String newContent){
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor){
        this.author= newAuthor;
    }
    public void rename(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return this.title + " - " +this.content + ": " + this.author;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(", ");
        Articles newArticle = new Articles(data[0],data[1],data[2]);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0;i<n;i++){
            String[] commandParts = scan.nextLine().split(": ");
            switch (commandParts[0]){
                case "Edit":
                    newArticle.Edit(commandParts[1]);
                    break;
                case "ChangeAuthor":
                    newArticle.changeAuthor(commandParts[1]);
                    break;
                case "Rename":
                    newArticle.rename(commandParts[1]);
                    break;

                }

            }
        System.out.println(newArticle.toString());
        }
    }

