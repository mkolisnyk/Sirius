require 'EditService.rb'
require 'soap/mapping'
module Sirius
module Client
module Win32
module Core
module Edit

module EditServiceMappingRegistry  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsControlsClassesWin32ServerSiriusOrg = "http:controls.classes.win32.server.sirius.org/"
  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetSel,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetSelResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::Scroll,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scroll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::Undo,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "undo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::UndoResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "undoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::EmptyUndoBuffer,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "emptyUndoBuffer"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::EmptyUndoBufferResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "emptyUndoBufferResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetSel,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetSelResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetPasswordChar,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPasswordChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetPasswordCharResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPasswordCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineLength,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineLength"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineLengthResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineLengthResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetModify,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getModify"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetModifyResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getModifyResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineIndexResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollCaret,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollCaret"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollCaretResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollCaretResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetPasswordChar,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPasswordChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetPasswordCharResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPasswordCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::CanUndo,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "canUndo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::CanUndoResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "canUndoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetFirstVisibleLine,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getFirstVisibleLine"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetFirstVisibleLineResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getFirstVisibleLineResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineFromChar,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineFromChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineFromCharResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineFromCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetLineCount,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLineCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetLineCountResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLineCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ReplaceSel,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "replaceSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  EncodedRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ReplaceSelResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "replaceSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetSel,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetSelResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::Scroll,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scroll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::Undo,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "undo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::UndoResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "undoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::EmptyUndoBuffer,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "emptyUndoBuffer"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::EmptyUndoBufferResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "emptyUndoBufferResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetSel,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetSelResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetPasswordChar,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPasswordChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetPasswordCharResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPasswordCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineLength,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineLength"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineLengthResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineLengthResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetModify,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getModify"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetModifyResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getModifyResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineIndex,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineIndexResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineIndexResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollCaret,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollCaret"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollCaretResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollCaretResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetPasswordChar,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPasswordChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetPasswordCharResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPasswordCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetText,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetTextResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::CanUndo,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "canUndo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::CanUndoResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "canUndoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetFirstVisibleLine,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getFirstVisibleLine"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetFirstVisibleLineResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getFirstVisibleLineResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineFromChar,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineFromChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineFromCharResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineFromCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetLineCount,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLineCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetLineCountResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLineCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ReplaceSel,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "replaceSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ReplaceSelResponse,
    :schema_type => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "replaceSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::CanUndo,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "canUndo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::CanUndoResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "canUndoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::EmptyUndoBuffer,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "emptyUndoBuffer"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::EmptyUndoBufferResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "emptyUndoBufferResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetFirstVisibleLine,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getFirstVisibleLine"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetFirstVisibleLineResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getFirstVisibleLineResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetLineCount,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLineCount"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetLineCountResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getLineCountResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetModify,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getModify"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetModifyResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getModifyResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetPasswordChar,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPasswordChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetPasswordCharResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getPasswordCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetSel,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetSelResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetText,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::GetTextResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "getTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPString", XSD::QName.new(nil, "return")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineFromChar,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineFromChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineFromCharResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineFromCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineIndex,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineIndex"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineIndexResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineIndexResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineLength,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineLength"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::LineLengthResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "lineLengthResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ReplaceSel,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "replaceSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ReplaceSelResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "replaceSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::Scroll,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scroll"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollCaret,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollCaret"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollCaretResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollCaretResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::ScrollResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "scrollResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetPasswordChar,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPasswordChar"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetPasswordCharResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setPasswordCharResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetSel,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setSel"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg1")]],
      ["arg2", ["SOAP::SOAPInt", XSD::QName.new(nil, "arg2")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetSelResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setSelResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetText,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setText"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]],
      ["arg1", ["SOAP::SOAPString", XSD::QName.new(nil, "arg1")], [0, 1]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::SetTextResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "setTextResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "return")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::Undo,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "undo"),
    :schema_element => [
      ["arg0", ["SOAP::SOAPLong", XSD::QName.new(nil, "arg0")]]
    ]
  )

  LiteralRegistry.register(
    :class => Sirius::Client::Win32::Core::Edit::UndoResponse,
    :schema_name => XSD::QName.new(NsControlsClassesWin32ServerSiriusOrg, "undoResponse"),
    :schema_element => [
      ["v_return", ["SOAP::SOAPInt", XSD::QName.new(nil, "return")]]
    ]
  )
end

end
end
end
end
end