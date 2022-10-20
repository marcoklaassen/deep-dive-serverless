# Deev Sive Serverless

## Related Repositories
* https://github.com/marcoklaassen/deep-dive-serverless-feedback-form
* https://github.com/marcoklaassen/deep-dive-serverless-feedback-persistence


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

