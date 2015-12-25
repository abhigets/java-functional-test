# ReadMe

### -Dbrowser
We have implemented a custom argument 'browser'. to customise our test to run on various browser.

It support following browsers

  - Firefox (actual browser)
  - Firefox Headless
  - Chrome Headless

corresponding values
```sh
<blank> by default it will choose Firefox driver i.e.try to launch actual browser
headlessFirefox
headlessChrome
```
### Running Tests
Following is are the ways one can run automation test.

  - Maven command
  - Through JUnit plugin in Intellij [i.e. IDE]
  - Cucumber plugin 

Will discuss in detail how we can run test by each method.

##### Maven
We have used maven as our build tool so that it is easy to integrate it with CI.
######  'Dbrowser'

so while passing argument through maven use
```sh
-Dbrowser="<value>"
```
> value = dont specify (firefox) , headlessFirefox , headlessChrome


To run test using maven, one can run following command from root directly. Below shell script will run all the feature file with attribute @all

```sh
$ sh mvn-runner.sh
```

Following command will list all the attribute that one can configure while running tests. So that we can have customize reporting , customise  our execution and so on . . .
```sh
$ sh list-all-cucumber-option.sh
```
> For reference refer following links which can help you to get some idea how we can customise
>https://github.com/cucumber/cucumber-java-skeleton


##### IDE
We can run test using IDE as well. Here will consider idea intellij as example. 
###### 1. CukeRunner + Junit
Tool like intellij has by default Junit plugin pre-installed. So to run test do following steps

  - In project, locate CukesRunner file (src/test/java/CukesRunner.java)
  - Right click
  - Select Run CukeRunner
  - [Junit-ide-know-more] : to further customise


###### 2. Cucumber Intellij plugin
Idea Intellij has a cucumber plugin that make life much more easy to run scenarios, feature files, syntax highlighting, code generator for steps files

Run an individual scenario

  - Locate feature file (/src/test/resource/Journey.feature)
  - Open it by double clicking
  - Right click on a any of scenario e.g. 'Scenario: Create a Quotation ......'
  - select 'Run 'Scenario:' Create a Quotation.......' '

Run an feature file

  - Locate feature file (/src/test/resource/Journey.feature)
  - Open it by double clicking
  - Right click on feature declaration i,e 'Feature: simple journey' (first line of feature file)
  - select ' Run 'Journey.feature' '

###### 3. Setting  'Dbrowser' argument in IDE
Once you run a scenarios using either Junit or cucumber plugin

  - In Intellij tool bar (located at top)
  - click the drop down just besides Run button
  - Select 'Edit Configuration'
  - A new window will open
  - Set VM Option with Dbrowser e.g. -Dbrowser=headlessFirefox
  - [run-edit-configuration-intellij] : refer for more details
  

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [Junit-ide-know-more]: <https://github.com/cucumber/cucumber-jvm/wiki/IDE-support>
   [cucumber-plugin-official-site]: <https://plugins.jetbrains.com/plugin/7212?pr=idea>
   [run-edit-configuration-intellij]:  <https://www.jetbrains.com/idea/help/creating-and-editing-run-debug-configurations.html>
   
   
   
   


