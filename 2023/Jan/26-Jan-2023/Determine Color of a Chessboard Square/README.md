# APPROACHES

## Approach 1

### Got error

- Solution.java did not work giving the below error  

```shell
Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Short.parseShort(Short.java:118)
        at java.lang.Short.parseShort(Short.java:144)
        at Solution.squareIsWhite(Solution.java:8)
        at Solution.main(Solution.java:32)

```

### Corrected

I have just clarified a few logical errors  
By watching the values in console.

## Solution2.java

Just changing the short to int and Short.parseShort with Integer.parseInt  
