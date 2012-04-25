import placement.Status
class BootStrap {

    def init = { servletContext ->
	def status1 = new Status(code:'55', description:'lala').save();
    }
    def destroy = {
    }
}
