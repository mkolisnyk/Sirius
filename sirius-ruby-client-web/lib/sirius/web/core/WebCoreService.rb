# encoding: UTF-8
require 'xsd/qname'

module Sirius; module Client; module Web; module Core


# {http:web.server.sirius.org/}selectWindow
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
class SelectWindow    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)
      @arg0 = arg0
      @arg1 = arg1
  end
end
# {http:web.server.sirius.org/}selectWindowResponse
class SelectWindowResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}isSelected
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class IsSelected    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)
      @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}isSelectedResponse
#   m_return - SOAP::SOAPBoolean
class IsSelectedResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)
      @v_return = v_return
  end
end
# {http:web.server.sirius.org/}start
#   arg0 - SOAP::SOAPString
class Start    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}startResponse
#   m_return - SOAP::SOAPString
class StartResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:web.server.sirius.org/}selectFrameByIndex
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPInt
class SelectFrameByIndex    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:web.server.sirius.org/}selectFrameByIndexResponse
class SelectFrameByIndexResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}getLocation
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class GetLocation    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}getLocationResponse
#   m_return - Sirius::Client::Web::Core::Point
class GetLocationResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:web.server.sirius.org/}point
#   x - SOAP::SOAPInt
#   y - SOAP::SOAPInt
class Point    
  attr_accessor :x    
  attr_accessor :y

    def initialize(x = nil, y = nil)  @x = x
    @y = y
  end
end
# {http:web.server.sirius.org/}selectAlert
#   arg0 - SOAP::SOAPString
class SelectAlert    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}selectAlertResponse
class SelectAlertResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}getURL
#   arg0 - SOAP::SOAPString
class GetURL    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}getURLResponse
#   m_return - SOAP::SOAPString
class GetURLResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:web.server.sirius.org/}submit
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class Submit    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}submitResponse
class SubmitResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}selectFrameByName
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
class SelectFrameByName    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:web.server.sirius.org/}selectFrameByNameResponse
class SelectFrameByNameResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}isEnabled
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class IsEnabled    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}isEnabledResponse
#   m_return - SOAP::SOAPBoolean
class IsEnabledResponse  
    def m_return
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:web.server.sirius.org/}back
#   arg0 - SOAP::SOAPString
class Back    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}backResponse
class BackResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}forward
#   arg0 - SOAP::SOAPString
class Forward    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}forwardResponse
class ForwardResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}clear
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class Clear    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}clearResponse
class ClearResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}open
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
class Open    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:web.server.sirius.org/}openResponse
class OpenResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}getText
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class GetText    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(_arg0 = nil, _arg1 = nil, _arg2 = nil)  
      @arg0 = _arg0
      @arg1 = _arg1
      @arg2 = _arg2    end
end
# {http:web.server.sirius.org/}getTextResponse
#   m_return - SOAP::SOAPString
class GetTextResponse  
    def m_return 
      @v_return
  end

    def m_return=(value)  
      @v_return = value
  end

    def initialize(v_return = nil)  
      @v_return = v_return
  end
end
# {http:web.server.sirius.org/}getSize
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class GetSize    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)
      @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}getSizeResponse
#   m_return - Sirius::Client::Web::Core::Dimension
class GetSizeResponse  
    def m_return  
      @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:web.server.sirius.org/}dimension
#   width - SOAP::SOAPInt
#   height - SOAP::SOAPInt
class Dimension    
  attr_accessor :width    
  attr_accessor :height

    def initialize(width = nil, height = nil)
      @width = width
    @height = height
  end
end
# {http:web.server.sirius.org/}refresh
#   arg0 - SOAP::SOAPString
class Refresh    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}refreshResponse
class RefreshResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}getTagName
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class GetTagName    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(token = nil, start_from = nil, locator = nil)
      @arg0 = token
      @arg1 = start_from
      @arg2 = locator
  end
end
# {http:web.server.sirius.org/}getTagNameResponse
#   m_return - SOAP::SOAPString
class GetTagNameResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)
      @v_return = v_return
  end
end
# {http:web.server.sirius.org/}getTitle
#   arg0 - SOAP::SOAPString
class GetTitle    
  attr_accessor :arg0

    def initialize(arg0 = nil)
      @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}getTitleResponse
#   m_return - SOAP::SOAPString
class GetTitleResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:web.server.sirius.org/}isDisplayed
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class IsDisplayed    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)
      @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}isDisplayedResponse
#   m_return - SOAP::SOAPBoolean
class IsDisplayedResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)
      @v_return = v_return
  end
end
# {http:web.server.sirius.org/}selectDefaultContent
#   arg0 - SOAP::SOAPString
class SelectDefaultContent    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}selectDefaultContentResponse
class SelectDefaultContentResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}getWindowHandle
#   arg0 - SOAP::SOAPString
class GetWindowHandle    
  attr_accessor :arg0

    def initialize(arg0 = nil)
      @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}getWindowHandleResponse
#   m_return - SOAP::SOAPString
class GetWindowHandleResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)
      @v_return = v_return
  end
end
# {http:web.server.sirius.org/}stop
#   arg0 - SOAP::SOAPString
class Stop    
  attr_accessor :arg0

    def initialize(arg0 = nil)
      @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}stopResponse
class StopResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}sendKeys
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
#   arg3 - SOAP::SOAPString
class SendKeys    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2    
  attr_accessor :arg3

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil)  @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
    @arg3 = arg3
  end
end
# {http:web.server.sirius.org/}sendKeysResponse
class SendKeysResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}getPageSource
#   arg0 - SOAP::SOAPString
class GetPageSource    
  attr_accessor :arg0

    def initialize(arg0 = nil)
      @arg0 = arg0
  end
end
# {http:web.server.sirius.org/}getPageSourceResponse
#   m_return - SOAP::SOAPString
class GetPageSourceResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:web.server.sirius.org/}getAttribute
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
#   arg3 - SOAP::SOAPString
class GetAttribute    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2    
  attr_accessor :arg3

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil)
      @arg0 = arg0
      @arg1 = arg1
      @arg2 = arg2
      @arg3 = arg3    end
end
# {http:web.server.sirius.org/}getAttributeResponse
#   m_return - SOAP::SOAPString
class GetAttributeResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)
      @v_return = v_return
  end
end
# {http:web.server.sirius.org/}click
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
class Click    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)
      @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:web.server.sirius.org/}clickResponse
class ClickResponse  
    def initialize
  end
end
# {http:web.server.sirius.org/}getCssValue
#   arg0 - SOAP::SOAPString
#   arg1 - SOAP::SOAPString
#   arg2 - SOAP::SOAPString
#   arg3 - SOAP::SOAPString
class GetCssValue    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2    
  attr_accessor :arg3

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil, arg3 = nil)
      @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
    @arg3 = arg3
  end
end
# {http:web.server.sirius.org/}getCssValueResponse
#   m_return - SOAP::SOAPString
class GetCssValueResponse  
    def m_return
      @v_return
  end

    def m_return=(value)
      @v_return = value
  end

    def initialize(v_return = nil)
      @v_return = v_return
  end
end

end; end; end; end
