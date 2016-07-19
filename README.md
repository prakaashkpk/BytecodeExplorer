This project is fork of vgrazi BytecodeExplorer - https://github.com/vgrazi/BytecodeExplorer

# BytecodeExplorer
## Current state
This application consist of two interfaces; Java and AngularJS, that allow the user to upload a .class file (does not go to the server), and opens the file in a 
Hex editor on the left. As you mouse over the hex, the decompile pane on the right displays the translation of the bytecode.

For example, mousing over the constant pool displays the translation of each constant. Mousing over any method displays the disassembled
method instruction, such as would be seen in javap

This is intended to help users understand the organization of bytecode.

## Goals
Eventually I would like to finish translating this to Java, with the purpose of creating an agent to execute the desired code in the JVM and
monitor the stack and program registers. 

## Usage
To launch the Java version build it using Maven, then run java com.vgrazi.bytecodeexplorer.BytecodeExplorer target/classes/com/vgrazi/SampleClass.class
(Other classes may or may not work at this time). There is a sample.sh and sample.bat shell script you can use to build and launch that.

## Steps to run the tool(Mac OS). 
1. Install brew if not installed already. Follow instructions on http://brew.sh
   `/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"`
2. Install maven \
	`brew install maven`
3. Once maven is installed. Run `mvn install` 
4. Run the application\
	`java -cp target/bytecode-explorer-1.0.0-SNAPSHOT.jar com.vgrazi.bytecodeexplorer.BytecodeExplorer <Sample_class_file>`\
	For example:\
		`java -cp target/bytecode-explorer-1.0.0-SNAPSHOT.jar com.vgrazi.bytecodeexplorer.BytecodeExplorer ./target/classes/com/vgrazi/sample/SampleClass.class`

## Screenshot
![alt text](bytecode-explorer.png "BytecodeExplorer")

## Browser based version
This easiest way to get the browser based version going is to load the project in IntelliJ (Community edition will do for execution, but Ultimate Edition or 
WebStorm recommended for coding). Open the file bytecode-explorer.html in IntelliJ
and mouse over the top right of the editor screen. A list of browser icons will appear. Choose Chrome (I have not tested it in other browsers yet)

The URL http://localhost:63342/Bytecode-Explorer/src/main/html/bytecode-explorer.html should open.

Select a class file (start with something simple, for example com.vgrazi.SampleClass.class) in the "Choose files" selector.

When the class file opens in the hex editor in the left browser pane, mouse over the hex portion to see the disassembled code in the right frame of the browser page.

The JavaScript version will probably not be enhanced in the future



&copy; Victor Grazi 2015