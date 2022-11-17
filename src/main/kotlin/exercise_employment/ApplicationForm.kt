package exercise_employment

import java.util.*
import java.time.LocalDateTime

fun main() {
    val form = ApplicationForm()

   form.positionApplyingFor = "Programmer"

    println("Position : ${form.positionApplyingFor}")
}

class ApplicationForm {
    var positionApplyingFor: String = "Janitor"
        get() = "Getting $field"
        set(value) {
            field = "Setting $value"
        }
    var dateAvailableForWork = Date()
    var desiredSalary = 0.0

    lateinit var personalInfo: PersonalInfo
    var educationalBackground:ArrayList<EducationInfo> = ArrayList()
    var employment:ArrayList<Employment> = ArrayList()
    var references:ArrayList<References> = ArrayList()

    init{
        println("Init Called")
    }

    companion object{
        var applicantCount = 0
        fun increaseApplication(){
            println("Companion Object Called")
            applicantCount ++
        }
    }

    constructor() {
        println("Constructor Called")
        personalInfo = PersonalInfo()
    }

    fun addPersonalInfo( lastname: String?,
                         firstname: String?,
                         middleName: String?,
                         address: String?,
                         city: String?,
                         state: String?,
                         zipCode: Int = 0) {

        personalInfo = PersonalInfo()

        with(personalInfo){
            this.lastname = lastname
            this. firstname = firstname
            this. middleName = middleName
            this. address = address
            this. city = city
            this. state = state
            this. zipCode= zipCode
            this. sss = sss
            this. usCitizenship = usCitizenship
            this. convictedFelony = convictedFelony
            this. drugScreenTest = drugScreenTest
        }
        personalInfo.apply{}
        personalInfo.run{}

        personalInfo.let{
            it.lastname = lastname
            it. firstname = firstname
            it. middleName = middleName
            it. address = address
            it. city = city
            it. state = state
            it. zipCode= zipCode
            it. sss = sss
            it. usCitizenship = usCitizenship
            it. convictedFelony = convictedFelony
            it. drugScreenTest = drugScreenTest
        }
        personalInfo.also{}
    }

    fun addPersonalInfoContact(type: String,
                               details: String){
       // personalInfo.addContacts(Contacts)
    }

        var contacts:ArrayList<Contacts> = ArrayList()

        var sss: String? = null
        var usCitizenship: Boolean? = null
        var convictedFelony: Boolean? = null
        var drugScreenTest: Boolean? = null

    fun addContacts(contacts: Contacts){
        //contacts.add(contacts)
    }

    fun addEducation(  schoolName: String? = "",
                       schoolLocation: String? = "",
                       yearAttended: Int? = 0,
                       degreeReceived: String? = "",
                       major: String? = ""){
        val education = EducationInfo()

        education.apply {
            this.schoolName = schoolName
            this.schoolLocation = schoolLocation
            this.yearAttended = yearAttended
            this.degreeReceived = degreeReceived
            this.major = major
            educationalBackground.add(this)
        }

    }

    fun addEmployment(){

    }

    fun addReferences(){

    }
}

class PersonalInfo {
    var lastname: String? = null
    var firstname: String? = null
    var middleName: String? = null

    var address: String? = null
    var city: String? = null
    var state: String? = null
    var zipCode: Int = 0

    var contacts:ArrayList<Contacts> = ArrayList()

    var sss: String? = null
    var usCitizenship: Boolean? = null
    var convictedFelony: Boolean? = null
    var drugScreenTest: Boolean? = null
}
class Contacts(var type:String, var details:String){

}

class EducationInfo {
    var schoolName: String? = ""
    var schoolLocation: String? = ""
    var yearAttended: Int? = 0
    var degreeReceived: String? = ""
    var major: String? = ""
}
class Employment{
    var employer: String? = null
    var employmentStarDate: LocalDateTime? = null
    var employmentEndDate: LocalDateTime? = null
    var workPhone: String? = null
    var payRateMinimum: Double = 0.0
    var payRateMaximum: Double = 0.0
    var address: String? = null
    var city: String? = null
    var zipCode: Int = 0

    var position: String? = null
    var duties:ArrayList<String> = ArrayList()
    var supervisor:ArrayList<Supervisor> = ArrayList()
    var reasonForLeaving: String? = null
    var contactThem: Boolean = false

    inner class Supervisor(  var firstName: String = "",
                       var middleName: String = "",
                       var lastName: String = "",
                       var supervisorTitle: String)
}

class References(  var firstName: String = "",
                   var middleName: String = "",
                   var lastName: String = "",
                   var title: String= "",
                   var company: String= "",
                   var contacts: Contacts){

    constructor() : this("","","","","", Contacts("",""))
}
