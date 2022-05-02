package assignment;

public class LoginController {
		public ViewResult LoginForm() {
			return View();
		}
		
		public JsonResult LoginValidate(Userdata) {
			 HttpClient client = new HttpClient();  
		        string _url = ConfigurationManager.AppSettings["webapibaseurl"];  
		        client.BaseAddress = new Url(_url);  
		        client.DefaultRequestHeaders.Accept.Add(new MediaTypeWithQualityHeaderValue("application/json"));  
		        MediaTypeFormatter jsonFormatter = new JsonMediaTypeFormatter();  
		        HttpResponseMessage response = client.GetAsync(“URL”).Result;  
		        string content1 = response.Content.ReadAsStringAsync().Result;  
		        if (response.StatusCode.ToString() == "OK") {  
		            return Json(content1, JsonRequestBehavior.AllowGet);  
		}
		 
		 public ActionResult Index() {  
		            if (Session["Email"] != null) {  
		                return View();  
		            } else {  
		                return RedirectToAction("LoginView");  
		            }  
		        }   
}
