# Sorting Tool
JetBrains Academy. Project: Sorting Tool.

In this project, written program processes textual and numeric data</br>
and sorts it. Program will be able to determine the biggest</br>
or most frequent pieces of data and perform the necessary</br>
calculations on them.

Command-line arguments to</br>
support the sorting type definition:

>1.if the -sortingType argument is provided,</br>
>it should be followed by natural or byCount,</br>
>which defines the sorting type.</br></br>
>2.if the argument is not provided, then consider</br>
>natural to be the default sorting type.
> 
Implement natural sorting for words and lines, and sorting by count</br>
for all data types. Within the group, elements with equal count</br>
values should be sorted naturally.

Command-line arguments to support the -inputFile and -outputFile</br>
arguments:

>1.If -inputFile is provided followed by the file name, read the input</br>
> data from the file.</br>
2.If -outputFile is provided followed by the file name, output only</br>
> the error messages to the console and print the results to the file.

Command-line args to support the -dataType and -sortingType</br>
arguments:

>1. -dataType is followed by one of three types: long, line, word.
>2. -sortingType is followed by one of two types: natural, byCount.

Exception handling for possible errors and output error messages to</br>
the console:

>1.if the -sortingType argument is provided but the</br>
>type is not, print a message No sorting type defined!
> 
>2.if the -dataType argument is provided but the type</br>
> is not, print No data type defined!
> 
>3.if unknown command-line arguments are provided,</br>
> print "-arg" is not a valid parameter. It will be skipped.</br>
> for each unknown argument -arg;
> 
>4.if there are strings in the input, but the data type is</br>
> defined as long, print "abc" is not a long. It will be</br>
> skipped. for each string abc from the input.

Jar file is located by ./Sorting Tool/task/build/libs.