For Programming Project 3, all of the classes shall be declared in a package named proj03.

Packages in Java are simply implemented as subdirectories under the directory where the source code
files are stored using whatever IDE you are using. For example, suppose we have a project named
SomeProject and our IDE creates a directory named SomeProject to store the files for the project.

Suppose all of our IDE projects are stored in the directory /home/kevin/cse205/projs (or
~/cse205/projs, where ~ represents my home directory of /home/kevin).

Then, when we create the SomeProject project, our IDE will create the directory:

    ~/cse205/projs/SomeProject       -- this is the Project Directory

and suppose our IDE creates a src subdirectory to store the source code files of our project:

    ~/cse205/projs/SomeProject/src   -- this is the Project Source Code File Directory

Now, suppose we add a class named Main to our project and Main is not declared in a package. Then,
Main will be declared in the default package and our project will store the class in Main.java in
the src subdirectory.

    ~/cse205/projs/SomeProject/src/Main.java  -- Main is declared in the default package

Now, suppose we add a new class named SomeClass to our project and we declare SomeClass in a pack-
age named package_a. Then, our IDE will create a subdirectory named project_a under src, and our
two classes will be stored as:

    ~/cse205/projs/SomeProject/src/Main.java                 -- Main declared in default package
    ~/cse205/projs/SomeProject/src/package_a/SomeClass.java  -- SomeClass is declared in package_a

If we are building the project at the command line using the javac command, then we would need to
make ~/cse205/projs/SomeProject/src our current working directory and then perform this command to
build:

    ~/cse205/projs/SomeProject/src $ javac Main.java package_a/SomeClass.java

where the $ and everything to the left of it is just our terminal prompt string; the actual
build command starts with javac.

Consequently, the starting source code files have been placed in /src/proj3 because all of the
Project 3 classes are declared in the proj3 package.

-- Kevin
