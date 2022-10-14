# rest-service
REST service to return word frequency

Prerequisites:
Java v8 or later 
Maven v3.8.6
Spring boot v2.7.4

How to use:
run RestServiceApplication.java

Open web browser.

The service uses localhost port 8080.
The service have two pages

localhost:8080/text - returns the input text as specified in InputText.java input variable

localhost:8080/text/count - returns the most frequent words in text in ascending order, by defaullt returns 10 words along with their frequency
                          - can be used with parameter ?words=n to return n words along with frequency
