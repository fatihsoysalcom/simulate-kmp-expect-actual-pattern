// This file simulates the core concept of Kotlin Multiplatform's 'expect/actual' mechanism.
// In a real KMP project, 'expect' declarations reside in common modules,
// and 'actual' implementations are provided in platform-specific modules (e.g., jvmMain, jsMain).
// The KMP build system then links the correct 'actual' implementation for each target platform.

// 1. Conceptual 'expect' declaration: A common interface defining platform-specific behavior.
//    In a real KMP project, this would be marked with the 'expect' keyword.
interface PlatformSpecificService {
    fun getPlatformName(): String
    fun performPlatformSpecificAction(): String
}

// 2. Conceptual 'actual' implementation for the JVM platform.
//    In a real KMP project, this would be marked with the 'actual' keyword
//    and reside in the 'jvmMain' source set.
class JvmService : PlatformSpecificService {
    override fun getPlatformName(): String = "JVM (Desktop/Server)"
    override fun performPlatformSpecificAction(): String = "Executing JVM-specific file I/O or network call."
}

// 3. Conceptual 'actual' implementation for a hypothetical JavaScript platform.
//    In a real KMP project, this would be marked with the 'actual' keyword
//    and reside in the 'jsMain' source set.
//    This part is not directly runnable in this single JVM file, but demonstrates the structure.
class JsService : PlatformSpecificService {
    override fun getPlatformName(): String = "JavaScript (Browser/Node.js)"
    override fun performPlatformSpecificAction(): String = "Executing JS-specific DOM manipulation or API call."
}

// 4. A factory function to conceptually 'select' the appropriate 'actual' implementation.
//    In a real KMP project, the KMP compiler and build system handle this selection automatically.
//    Here, we simulate it by returning a specific implementation for demonstration.
fun getPlatformService(): PlatformSpecificService {
    // For this single-file example targeting JVM, we return the JvmService.
    // In a real KMP setup, the compiler would automatically pick the 'actual'
    // implementation corresponding to the target platform being built.
    return JvmService()
}

fun main() {
    println("--- Demonstrating KMP 'expect/actual' concept ---")

    // Use the conceptually platform-specific service
    val service = getPlatformService()

    println("\nDetected Platform: ${service.getPlatformName()}")
    println("Platform-specific Action: ${service.performPlatformSpecificAction()}")

    // Illustrate a hypothetical scenario for another platform
    println("\n--- Hypothetical JavaScript Platform Execution ---")
    val jsService = JsService() // Directly instantiate for conceptual demonstration
    println("Hypothetical Platform: ${jsService.getPlatformName()}")
    println("Hypothetical Action: ${jsService.performPlatformSpecificAction()}")

    println("\nThis example shows how a common interface (like 'expect') can have different implementations (like 'actual') for various platforms.")
}
