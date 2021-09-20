# RefactoringKotlin

- 「パラメータへの代入の除去 Remove Assignment to Parameters」は、パラメータへの代入がそもそも不可能。
- 「アルゴリズムの取り替え Substitute Algorithm」は、単純にアルゴリズムを変更するだけなので、ここではとりあげない。
- 「外部メソッドの導入 Introduce Foreign Method」は、Extensionで提供されているので不要。
- 「局所的拡張の導入 Introduce Local Extension」は、サブクラスかラッパーを作って既存のクラスの拡張をする方法。