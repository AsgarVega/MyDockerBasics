/*

 * 13. Roman to Integer
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * 
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * 
 * Example 1:
 * 
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 * 
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 * 
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *  
 * Constraints:
 * 
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

public class Problema13{
    public static void main(String args[]){
        System.out.println(romanToInt("LVIII"));
    }
    static int romanToInt(String s) {
        char buffer=' ', next=' ';
        // M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I;
        int i =0;
        int res =0;
        while(i<s.length()){
            buffer =s.charAt(i);
            try {
                next =s.charAt(i+1);
            } catch (Exception e) {
                next=' ';
            }
            switch (buffer) {
                case 'M':{
                    res+=1000;
                    i++;
                    break;
                }
                case 'D':{
                    res+=500;
                    i++;
                    break;
                }
                case 'C':{
                    if(next=='M'){
                        res+=900;
                        i+=2;    
                        }else 
                        if(next=='D'){
                        res+=400;
                        i+=2;    
                        }else{
                        res+=100;
                        i++;
                    }
                    break;
                }
                case 'L':{
                    res+=50;
                    i++;
                    break;
                }
                case 'X':{
                    if(next=='C'){
                        res+=90;
                        i+=2;    
                    }else if(next=='L'){
                        res+=40;
                        i+=2;    
                    }else{
                        res+=10;
                        i++;
                    }
                    break;
                }
                case 'V':{
                    res+=5;
                    i++;
                    break;
                }
                case 'I':{
                    if(next=='X'){
                        res+=9;
                        i+=2;    
                    }else if(next=='V'){
                        res+=4;
                        i+=2;    
                    }else{
                        res+=1;
                        i++;
                    }
                    break;
                }
                default:{
                    System.err.println("algo raro paso s="+s);
                    i+=99;
                    break;
                }
            }
        }
        return res;
    }
}