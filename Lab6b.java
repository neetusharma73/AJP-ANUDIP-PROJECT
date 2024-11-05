import java.util.*;
public class Lab6b{
    public static void main(String[] args){
        Stack<Integer> st=new Stack<Integer>();
        st.push(1);
        st.push(12);
        st.push(6);
        st.push(7);
        st.push(3);
        st.push(9);
        st.push(34);
        st.push(67);
        st.push(55);
        st.push(22);
        st.push(44);
        st.push(66);
        System.out.println("The elements are: ");
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println("After remove");
        System.out.println(st);
    }
}
