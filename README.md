# Simulate KMP Expect Actual Pattern

This example demonstrates the core concept of Kotlin Multiplatform's 'expect/actual' mechanism by simulating it within a single Kotlin file. It defines a common interface (representing an 'expect' declaration) and provides different platform-specific implementations (representing 'actual' implementations). This illustrates how KMP allows sharing common API declarations while providing tailored code for each platform.

## Language

`kotlin`

## How to Run

1. Ensure you have the Kotlin compiler (kotlinc) installed on your system.
2. Save the code as `main.kt`.
3. Open your terminal or command prompt, navigate to the directory where you saved `main.kt`, and run the following commands:
   `kotlinc main.kt -include-runtime -d main.jar`
   `java -jar main.jar`

## Original Article

This example accompanies the Turkish article: [Kotlin Multiplatform'da 'expect/actual' Yaklaşımı: Varsayılan Tercih Neden Yanlış Olabilir?](https://fatihsoysal.com/blog/kotlin-multiplatformda-expect-actual-yaklasimi-varsayilan-tercih-neden-yanlis-olabilir/).

## License

MIT — see [LICENSE](LICENSE).
