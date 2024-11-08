The Assessment 2 - UI Testing - the-internet
==========================

### How to set up?
* Install [InteliJ IDEA Community Edition](https://www.jetbrains.com/idea/download)
* Install [git](https://git-scm.com/downloads)
* Clone the project from the git repo
* Open the project using Intellij
* Go to the pom.xml file, right click, select Maven then Reimport

### How to run the tests?

#### Before running
This project uses the following list of properties:
* Run docker server before test: docker run --rm -d -p 8080:5000 gprestes/the-internet

* ```testBrowser``` is the browser you want to run the test on and can be set to:
    * ```firefox```
    * ```chrome``` (default value)
  
#### Run specific testcase or testsuite
* Instead of running specific testcase or all the testcases in a class, you can go to ```testng.xml``` file and then configure the testsuite
