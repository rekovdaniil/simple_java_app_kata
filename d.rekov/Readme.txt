Homework#1
1. Created directory d.rekov/
2. Created directories  d.rekov/src and d.rekov/out
3. Created java file via atom  (d.rekov/homework.java)
4. d.rekov/homework.java compiled by javac command
5.d.rekov/homework.java moved to src/ folder
6.d.rekov/homework.class moved to out/ folder
__________________________________________
1-st commit made

7.Readme file created

__________________________________________
2-nd commit made


8. javac -d out src/homework.java
9. daniil@ubuntu:~/simple_java_app_kata/d.rekov$ java -cp out homework
First Homework
__________________________________
3-rd commit made

10. daniil@ubuntu:~/simple_java_app_kata/d.rekov$ jar -cvf app.jar out
added manifest
adding: out/(in = 0) (out= 0)(stored 0%)
adding: out/homework.class(in = 424) (out= 290)(deflated 31%)
11.daniil@ubuntu:~/simple_java_app_kata/d.rekov$ jar -cvf app.jar -C out/ .
added manifest
adding: homework.class(in = 424) (out= 290)(deflated 31%)
______________________________________
4 commit made

12. daniil@ubuntu:~/simple_java_app_kata/d.rekov$ java -jar app.jar
no main manifest attribute, in app.jar
13.java -cp app.jar homework
14. manifest.txt created
15. jar -cvfm app.jar manifest.txt -C out/

=(( an error is got((


jar -cvfm app.jar manifest.txt -C out/
Usage: jar {ctxui}[vfmn0PMe] [jar-file] [manifest-file] [entry-point] [-C dir] files ...


16. daniil@ubuntu:~/simple_java_app_kata/d.rekov$ java -jar app.jar
no main manifest attribute, in app.jar
Something get wrong with manifest file((
