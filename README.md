## Exerices

| Language | Exercise |
|:---|:---|
| Java |Calculate the average from a list of integers using streams|
||Find a set of matching Strings which contains the substring "EXE" from a list of names, using the streams functionlaity. Write unit tests using Junit|
||Do a N th prime number calculation logic implemented in function (implement a Thread.sleep(20000) to simulate a heavy processing to block the function for about 20 sec before return). It shoud be run in a separate thread from the calling thread. The return value should be returned via a promise/future. The calling function should wait for the result. Write unit tests using Junit|
||Do the above using a thread pool of fixed size. Assign the job to a free thread. The called should get the N from the command line and assign the job without blocking the thread. So it will go back to the command line prompt and take another number and assign job again. If there is no free thread it will immedtialy print a error "no free thread. try again". When a result is available it will print the result as "Nth prime number is xxxx"|
||Get a input string from command line and send it to a any number of consuming process via kafka. The consumers should print the received message in the console. On a restart the consumer should read only from the last read position. (No duplilcate printing of messages)|
||Above excercise should be repeated with the consumer doing a MD5 hash of the recieved message and storing it in Redis. Add a sleep of 20 sec between reading the message and doing the hash calculation and storing. In this case, if the consumer is killed while in the sleep (simulated failure) upon restart it will re-process the partially processed message. (i.e. hash is not written in Redis)|
||You should be able to find a memory leak of a snippet of code using VM and GC analysis tools. The code will be provided|