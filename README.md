# BeanEventListenerSample

Replacing Observer-Observable (inheritance vs. composition)

Since Java 9 the pair Observer-Observable have been declared deprecated.

They don't provide a rich enough event model for applications. 
For example, they support only the notion that something has changed, 
but they don't convey any information about what has changed. 
There are also some thread-safety and sequencing issues that cannot be fixed compatibly. 

[...]

Observable has fallen into disuse and is no longer under active development.

The deprecation forced me to look into the alternatives suggested. The Bean event model is quite general and can be adatped to the same use cases intended for the pair.

In addition comparing the two solutions we can observe two ditinct approaches to reused: inheritance vs. composition.
