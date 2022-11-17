# Deev Sive Serverless

## Related Repositories
* [Feedback Form Kafka Producer with simple HTLM Frontend](https://github.com/marcoklaassen/deep-dive-serverless-feedback-form/tree/kafka-deep-dive)
* [Feedback Backend with Kafka Consumer and Database Handling](https://github.com/marcoklaassen/deep-dive-serverless-feedback-persistence/tree/kafka-deep-dive)
* [Red Hat SSO Deployment](https://github.com/marcoklaassen/deep-dive-quarkus-2/tree/kafka-deep-dive)

## Test with curl
```
curl -X POST -i -H 'Content-Type: application/json' -d "{\"rating\":\"11\"}" http[s]://<url>/feedback
```

```
curl -i http[s]://<url>/feedback
```

## Test with ALI
```
brew install nakabonne/ali/ali
```

```
ali --duration=60s --rate=20 -t 120 http[s]://<url>
```
