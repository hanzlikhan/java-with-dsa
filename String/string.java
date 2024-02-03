
//  check a string is a palindrom or not 
// public class string{
//     public static boolean check(String name){
//         int n = name.length();
//         for(int i=0;i<n;i++){
//             if(name.charAt(i)!=name.charAt(n-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         String name = "racecar";
//         System.out.print(check(name));
//     }
// }
// Question NO:2
//   find the shortest path
// public class string{
//     public static float find(String name){
//         int x= 0;
//         int y= 0;
//         for(int i=0;i<name.length();i++){
//             int dir = name.charAt(i);
//             if(dir=='n'){
//                 y++;
//             }
//             else if (dir == 's') {
//                 y--;
//             }
//             else if (dir == 'w') {
//                 x--;
//             }
//             else{
//                 x++;
//             }
//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2+Y2);
//     }
//     public static void main(String args[]){
//         String name = "wneenesennn";
//         System.out.print(find(name));
//     }
// }

//  substring 
// public class string{
//     public static void sub(String str , int si,int ei){
//         String sub = "";
//         for(int i=si;i<ei;i++){
//             sub += str.charAt(i);
//         }
//         System.out.print(sub);
//     }
//     public static void main(String args[]){
//         String str = "hanzla";
//         sub(str,0,3);
//     }
// }
//  find the largest string

// public class string{
//     public static void main(String args[]){
//         String name[] = {"hanzla","sohaib","irfan","hamad"};
//         String large = name[0];
//         for(int i=0;i<name.length;i++){
//             if (large.compareTo(name[i])<0) {
//                 large = name[i];
//             }
//         }
//         System.out.println(large);
//     }
// }

//  String builder 

// public class string{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch ='a';ch<='z';ch++){
//             sb.append(ch);
//         }
//         System.out.print(sb);
//     }
// }

//    Question
//   First letter of each word to the upper case

// public class string{
//     public static void convert(String sen){
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(sen.charAt(0));
//         sb.append(ch);
//         for(int i=1;i<sen.length();i++){
//             if(sen.charAt(i)==' ' && i<sen.length()-1){
//                 sb.append(sen.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(sen.charAt(i)));
//             }else{
//                 sb.append(sen.charAt(i));
//             }
//         }
//         System.out.print(sb.toString());
//     }
//     public static void main(String args[]){
//         String sen = "hi, i am hanzla";
//         convert(sen);
//     }
// }
//    
//  compressthe string

// public class string{
//     public static void comp(String str){
//         String newstr = "";
//         for(int i=0;i<str.length();i++){
//             Integer count = 1;
//             while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
//                 count++;
//                 i++;
//             }
//             newstr += str.charAt(i);
//         }
//     }
//     public static void main(String args[]){
//         String name = "aaaabbbcc";
//         comp(name);
//     }
// }
