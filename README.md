# WSO2 Enterprise Integrator in Kubernetes

![](/img/header.png)

Proof of concept to look into WSO2 Enterprise Integrator 7 in a microservice strategy.

```sh
$ kubectl port-forward <health-pod> 8290
```

```sh
$ curl http://localhost:8290/health/doctor/hospital/SVQ002 -H 'Content-Type: application/json' -w "\n" | jq -c
```
