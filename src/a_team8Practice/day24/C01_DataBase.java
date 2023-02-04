package a_team8Practice.day24;

import com.sun.source.tree.LambdaExpressionTree;

import java.sql.Connection;

public class C01_DataBase {
    interface lambda{
        int calistir(int x);
    }
    public static void main(String[] args) {
        lambda l=((int x) -> x+1 );
        System.out.println(l.calistir(78));


    }
}
