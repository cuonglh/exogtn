/**
 * Copyright (C) 2009 eXo Platform SAS.
 * 
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.exoplatform.webui.core.lifecycle;

import org.exoplatform.webui.application.WebuiRequestContext;

/**
 * Created by The eXo Platform SAS
 * Aug 23, 2006  
 * 
 * Writes a decorator template with the given css class style
 */
public class Decorator
{
   //<%decorator.start(.., ..)%>
   final public void start(String cssClass, String style) throws Exception
   {
      WebuiRequestContext context = WebuiRequestContext.getCurrentInstance();
      context.getWriter().append("<div class=\"").append(cssClass).append("\">").append("<div class=\"").append(style)
         .append("\" style=\"margin: 0px\">").append("<div class=\"TopLeftCornerBoxDecorator\">").append(
            "<div class=\"TopRightCornerBoxDecorator\">").append(
            "<div class=\"TopCenterBoxDecorator\"><span></span></div>").append("</div>").append("</div>").append(
            "<div class=\"MiddleLeftSideBoxDecorator\">").append("<div class=\"MiddleRightSideBoxDecorator\">").append(
            "<div class=\"DecoratorBackground\">");

   }

   final public void end() throws Exception
   {
      WebuiRequestContext context = WebuiRequestContext.getCurrentInstance();
      context.getWriter().append("</div>").append("</div>").append("</div>").append(
         "<div class=\"BottomLeftCornerBoxDecorator\">").append("<div class=\"BottomRightCornerBoxDecorator\">")
         .append("<div class=\"BottomCenterBoxDecorator\"><span></span></div>").append("</div>").append("</div>")
         .append("</div>").append("</div>");
   }
}