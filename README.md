Currently in incubation and only supports dot product of a seq of
BigDecimal. Is in a very early draft stage. Contributors welcome,
**production usage not recommended!**

### Design

Where possible make usage look like mathematical matrix notation,
i.e. for a dot product:

```scala
a ∙ b
```

For transpose:

```scala
a.ᵀ
```

Implement alternative invocations using full word method call:

```scala
a dot b
a.transpose
```

### Contributing

Please fork the repo and create a pull request with your changes.