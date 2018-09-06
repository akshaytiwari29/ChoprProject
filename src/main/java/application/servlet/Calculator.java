/*******************************************************************************
 * Copyright (c) 2016 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/ 
package application.servlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
* Servlet implementation class Calculator
*/
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }
 
                /**
                * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
                */
                protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                {
                        try
                        {
                        response.setContentType("text/html");
                        PrintWriter out= response.getWriter();
                        int a1= Integer.parseInt(request.getParameter("n1"));
                        int a2= Integer.parseInt(request.getParameter("n2"));
                        if(request.getParameter("r1")!=null)
                        {
                            out.println("<h1>Addition</h1>"+(a1+a2));
                        }
                        if(request.getParameter("r2")!=null)
                        {
                            out.println("<h1>Substraction</h1>"+(a1-a2));
                        }
                        if(request.getParameter("r3")!=null)
                        {
                            out.println("<h1>Multiplication</h1>"+(a1*a2));
                        }if(request.getParameter("r1")!=null)
                        {
                            out.println("<h1>Division</h1>"+(a1/a2));
                        }
                        }
                        catch(Exception e)
                        {
 
                        }
                    }
                }
 
}

