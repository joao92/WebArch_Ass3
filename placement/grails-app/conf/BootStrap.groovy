import placement.Status
import placement.Student
import placement.Application
import placement.PlacementOpportunity

class BootStrap {

    def init = { servletContext ->
	def status1 = new Status(code:'Invited for interview', description:'Interview needed.').save();
	def status2 = new Status(code:'Rejected', description:'You did not get the placement.').save();

	def student1 = new Student(name:'Joao', courseCode:'f567', notes:'Year 2', applications:'4').save();
	def student2 = new Student(name:'Timmy', courseCode:'h723', notes:'Year 3', applications:'8').save();

	def application1 = new Application(student:'Joao', placement:'Applied', status:'Invited for interview', 			   timestamp:'14:56').save(); 
	def application2 = new Application(student:'Timmy', placement:'Applied', status:'Rejected', timestamp:'3:45').save(); 

	def placementOpportunity1 = new PlacementOpportunity(jobTitle:'IT Assistant', companyName:'Lutterworth College', 				            applications:'3', status:'Interview needed').save();
	def placementOpportunity2 = new PlacementOpportunity(jobTitle:'Newtwork Assistant', companyName:'Apple inc.', 					    applications:'2', status:'Rejected').save();
    }
    def destroy = {
    }
}
