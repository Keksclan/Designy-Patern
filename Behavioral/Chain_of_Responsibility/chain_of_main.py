#Parent class
class RoleHandler:
    def __init__(self, rolle=None):
        self.rolle = rolle
        
    def handle_request(self, request):
        return None

#Check if the user is a Admin    
class CheckAdminPermission(RoleHandler):
    
    def handle_request(self, request):
        if request == "Admin":
            print("You are a Administrator")
        elif self.rolle:
            self.rolle.handle_request(request)

#Check if the user is a Employee
class CheckEmployeePermission(RoleHandler):
    def handle_request(self, request):
        if request == "Employee":
            print("You are a Employee")
        elif self.rolle:
            self.rolle.handle_request(request)
       

#Check if the request is Guest
class CheckGuestPermission(RoleHandler):
    def handle_request(self, request):
        if request == "Guest":
            print("You are a Guest")
        elif self.rolle:
            self.rolle.handle_request(request)
        
#Class who say that the user isn't allowed to have a friendly massage    
class NopeRoleHandler(RoleHandler):
    def handle_request(self, request):
        print(f"No one support You. because of you and your role: {request}")

def main():
    admin_check = CheckAdminPermission()
    employee_check = CheckEmployeePermission()
    guest_check = CheckGuestPermission()
    no_role_check = NopeRoleHandler()

    admin_check.rolle = employee_check
    employee_check.rolle = guest_check
    guest_check.rolle = no_role_check
    
    admin_check.handle_request("Admin")
    admin_check.handle_request("Employee")
    admin_check.handle_request("Guest")
    admin_check.handle_request("Imperator")
    
if __name__ == "__main__":
    main()