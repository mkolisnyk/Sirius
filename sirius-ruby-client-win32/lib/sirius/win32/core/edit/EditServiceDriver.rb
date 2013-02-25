require 'EditService.rb'
require 'EditServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Win32::Core::Edit


class Edit < ::SOAP::RPC::Driver  DefaultEndpointUrl = "http:localhost:21212/win32/edit"
  Methods = [
    [ "",
      "getModify",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetModify"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetModifyResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setText",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetText"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineIndex",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineIndex"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setSel",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetSel"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "scrollCaret",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ScrollCaret"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ScrollCaretResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "scroll",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "Scroll"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ScrollResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineFromChar",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineFromChar"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineFromCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "replaceSel",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ReplaceSel"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ReplaceSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSel",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetSel"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getLineCount",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLineCount"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLineCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "canUndo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "CanUndo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "CanUndoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineLength",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineLength"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineLengthResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "emptyUndoBuffer",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "EmptyUndoBuffer"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "EmptyUndoBufferResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getFirstVisibleLine",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetFirstVisibleLine"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetFirstVisibleLineResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getPasswordChar",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetPasswordChar"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetPasswordCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setPasswordChar",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetPasswordChar"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetPasswordCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "undo",
      [ [:in, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "Undo"]],
        [:out, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "UndoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

    def initialize(endpoint_url = nil)  endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = EditServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = EditServiceMappingRegistry::LiteralRegistry
    init_methods
  end
private

    def init_methods
      Methods.each do |definitions|
              opt = definitions.last
              if opt[:request_style] == :document
                add_document_operation(*definitions)
              else
                add_rpc_operation(*definitions)
                qname = definitions[0]
                name = definitions[2]
                if qname.name != name and qname.name.capitalize == name.capitalize
                  ::SOAP::Mapping.define_singleton_method(self, qname.name) do |*arg|
                    __send__(name, *arg)
                  end
                end
              end
            end

  end
end

end
