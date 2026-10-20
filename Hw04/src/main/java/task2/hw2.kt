// task2/hw2.kt
package task2

enum class SubmissionStatus(val label: String) {
    NOT_SUBMITTED("Not submitted yet"),
    SUBMITTED("Submitted"),
    LATE("Late submission"),
    GRADED("Graded")
}

fun printStatusInfo(status: SubmissionStatus) {
    val message = when (status) {
        SubmissionStatus.NOT_SUBMITTED -> "Please submit before the deadline."
        SubmissionStatus.SUBMITTED -> "Waiting for grading."
        SubmissionStatus.LATE -> "A late penalty may apply."
        SubmissionStatus.GRADED -> "Check your score in the portal."
    }
    println("${status.name}: ${status.label} -> $message")
}

fun main() {
    // Panggil fungsi untuk semua status
    printStatusInfo(SubmissionStatus.NOT_SUBMITTED)
    printStatusInfo(SubmissionStatus.SUBMITTED)
    printStatusInfo(SubmissionStatus.LATE)
    printStatusInfo(SubmissionStatus.GRADED)
}