# Diagrams.
This folder contains the diagrams used to describe some requirements or functionality.

## How to include a diagram in the readme files.
To include a diagram in the files and let github render it. It is necessary to use a proxy.

Proxy:
```
http://www.plantuml.com/plantuml/proxy
```
and pass the raw reference to the proxy in the image markdown notation.
```
![system overview](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/davormz/drink-advisor/main/docs/diagrams/client-server.puml)
```

