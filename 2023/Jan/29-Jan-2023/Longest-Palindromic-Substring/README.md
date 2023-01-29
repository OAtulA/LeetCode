# Approaches

## Brute force

String s  
maxPalin=0
palin =""
Loop {  
    get s.substr(i, s.length -i)
    // check palindrome
    reverse(substr) == substr  
    if substr.length() >maxPalin
        maxPalin =  substr.length()
        palin= substr
}  

### Approach 1

we can look for last index of s.charAt(i)
if s.lastIndexOf( s.charAt(i) ) != i
    check for palindrome
    update variables store length and substr.

## Commit id 825ea6d

working for  
String s = "cbbd";  

## Commit id 7715ef8

working for s ="a"

## commit id  86b6eba

working for s = "ac"
