# RefactoringKotlin

- 「パラメータへの代入の除去 Remove Assignment to Parameters」は、パラメータへの代入がそもそも不可能。
- 「アルゴリズムの取り替え Substitute Algorithm」は、単純にアルゴリズムを変更するだけなので、ここではとりあげない。
- 「外部メソッドの導入 Introduce Foreign Method」は、Extensionで提供されているので不要。
- 「局所的拡張の導入 Introduce Local Extension」は、サブクラスかラッパーを作って既存のクラスの拡張をする方法。
- 「自己カプセル化フィールド Self Encapsulate Field」は、プロパティが提供されているので不要。
- 「オブジェクトによる配列の置き換え Replace Array with Object」は、もはやありえないのでやらない。配列の要素番号で区別されているものを治す方法なので。