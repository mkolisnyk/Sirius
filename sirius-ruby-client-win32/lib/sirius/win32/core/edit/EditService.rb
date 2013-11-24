require 'xsd/qname'

module Sirius; module Client; module Win32; module Core; module Edit


# {http:controls.classes.win32.server.sirius.org/}setSel
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
#   arg2 - SOAP::SOAPInt
class SetSel    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:controls.classes.win32.server.sirius.org/}setSelResponse
#   m_return - SOAP::SOAPInt
class SetSelResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}scroll
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
#   arg2 - SOAP::SOAPInt
class Scroll    
  attr_accessor :arg0    
  attr_accessor :arg1    
  attr_accessor :arg2

    def initialize(arg0 = nil, arg1 = nil, arg2 = nil)  @arg0 = arg0
    @arg1 = arg1
    @arg2 = arg2
  end
end
# {http:controls.classes.win32.server.sirius.org/}scrollResponse
#   m_return - SOAP::SOAPInt
class ScrollResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}undo
#   arg0 - SOAP::SOAPLong
class Undo    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}undoResponse
#   m_return - SOAP::SOAPInt
class UndoResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}emptyUndoBuffer
#   arg0 - SOAP::SOAPLong
class EmptyUndoBuffer    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}emptyUndoBufferResponse
#   m_return - SOAP::SOAPInt
class EmptyUndoBufferResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSel
#   arg0 - SOAP::SOAPLong
class GetSel    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getSelResponse
#   m_return - SOAP::SOAPInt
class GetSelResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getPasswordChar
#   arg0 - SOAP::SOAPLong
class GetPasswordChar    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getPasswordCharResponse
#   m_return - SOAP::SOAPInt
class GetPasswordCharResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}lineLength
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
class LineLength    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}lineLengthResponse
#   m_return - SOAP::SOAPInt
class LineLengthResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}setText
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPString
class SetText    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}setTextResponse
#   m_return - SOAP::SOAPBoolean
class SetTextResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getModify
#   arg0 - SOAP::SOAPLong
class GetModify    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getModifyResponse
#   m_return - SOAP::SOAPInt
class GetModifyResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}lineIndex
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
class LineIndex    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}lineIndexResponse
#   m_return - SOAP::SOAPInt
class LineIndexResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}scrollCaret
#   arg0 - SOAP::SOAPLong
class ScrollCaret    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}scrollCaretResponse
#   m_return - SOAP::SOAPBoolean
class ScrollCaretResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}setPasswordChar
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
class SetPasswordChar    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}setPasswordCharResponse
#   m_return - SOAP::SOAPInt
class SetPasswordCharResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getText
#   arg0 - SOAP::SOAPLong
class GetText    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getTextResponse
#   m_return - SOAP::SOAPString
class GetTextResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}canUndo
#   arg0 - SOAP::SOAPLong
class CanUndo    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}canUndoResponse
#   m_return - SOAP::SOAPInt
class CanUndoResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getFirstVisibleLine
#   arg0 - SOAP::SOAPLong
class GetFirstVisibleLine    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getFirstVisibleLineResponse
#   m_return - SOAP::SOAPInt
class GetFirstVisibleLineResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}lineFromChar
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPInt
class LineFromChar    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}lineFromCharResponse
#   m_return - SOAP::SOAPInt
class LineFromCharResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}getLineCount
#   arg0 - SOAP::SOAPLong
class GetLineCount    
  attr_accessor :arg0

    def initialize(arg0 = nil)  @arg0 = arg0
  end
end
# {http:controls.classes.win32.server.sirius.org/}getLineCountResponse
#   m_return - SOAP::SOAPInt
class GetLineCountResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end
# {http:controls.classes.win32.server.sirius.org/}replaceSel
#   arg0 - SOAP::SOAPLong
#   arg1 - SOAP::SOAPString
class ReplaceSel    
  attr_accessor :arg0    
  attr_accessor :arg1

    def initialize(arg0 = nil, arg1 = nil)  @arg0 = arg0
    @arg1 = arg1
  end
end
# {http:controls.classes.win32.server.sirius.org/}replaceSelResponse
#   m_return - SOAP::SOAPInt
class ReplaceSelResponse  
    def m_return
  @v_return
  end

    def m_return=(value)  @v_return = value
  end

    def initialize(v_return = nil)  @v_return = v_return
  end
end

end; end; end; end; end
