You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class Prime should contain a single method checkPrime.

The locked code in the editor will call the checkPrime method with one or more integer arguments. You should write the checkPrime method in such a way that the code prints only the <a href="https://en.wikipedia.org/wiki/Prime_number" target="_blank">prime numbers.</a>
Please read the code given in the editor carefully. Also please do not use method overloading!

<b>Note:</b> You may get a compile time error in this problem due to the statement below:
<pre>
    BufferedReader br=new BufferedReader(new InputStreamReader(in));
</pre>

This was added intentionally, and you have to figure out a way to get rid of the error.

<h5>Input Format</h5>

There are only five lines of input, each containing one integer.

<h5>Output Format</h5>

There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should be printed.

<h5>Sample Input</h5>
<pre>
2
1
3
4
5
</pre>
<h5>Sample Output</h5>
<pre>
2 
2 
2 3 
2 3 5 
</pre>