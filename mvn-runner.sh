#running test on firefox
mvn test -Dcucumber.options="--tags @all --plugin pretty" -Dbrowser="headlessFirefox"

#running test on chrome
#mvn test -Dcucumber.options="--tags @all --plugin pretty" -Dbrowser="headlessChrome"
