A simple 5-mins kata which can help you to master the basics of java programm creation using CLI

```sh
$ javac -d out src/SimpleMain.java
```
```sh
java -cp out SimpleMain
Good start
```
```sh
$ jar -cvf app.jar out    # wrong, it includes the out folder to jar
```
```sh
$ jar -cvf app.jar -C out/ .    # correct
```
```sh
$ java -jar app.jar
no main manifest attribute, in app.jar
```
```sh
$ java -cp app.jar SimpleMain
```
```sh
# create a file with manifest.txt as a name and specify there Main-Class attribute
$ cat manifest.txt
Main-Class: SimpleMain
```
```sh
$ jar -cvfm app.jar manifest.txt -C out/ .
```
```sh
$ java -jar app.jar
Good start