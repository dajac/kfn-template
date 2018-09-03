FROM dajac/kfn-invoker:0.1.0
COPY target/libs/* /usr/lib/kfn/
COPY target/kfn-myfunction-0.1.0.jar /usr/lib/kfn/kfn-myfunction-0.1.0.jar