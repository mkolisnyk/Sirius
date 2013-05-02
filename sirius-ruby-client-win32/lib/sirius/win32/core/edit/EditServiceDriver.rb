require 'sirius/win32/core/edit/EditService.rb'
require 'sirius/win32/core/edit/EditServiceMappingRegistry.rb'
require 'soap/rpc/driver'

module Sirius::Client::Win32::Core::Edit


class Edit < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http:localhost:21212/win32/edit"
  Methods = [
    [ "",
      "getLineCount",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLineCount"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetLineCountResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineLength",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineLength"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineLengthResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setText",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetText"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetTextResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "scroll",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "Scroll"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ScrollResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "canUndo",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "CanUndo"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "CanUndoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getSel",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetSel"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setSel",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetSel"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "replaceSel",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ReplaceSel"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ReplaceSelResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineIndex",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineIndex"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineIndexResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "lineFromChar",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineFromChar"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "LineFromCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getModify",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetModify"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetModifyResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "scrollCaret",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ScrollCaret"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "ScrollCaretResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "emptyUndoBuffer",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "EmptyUndoBuffer"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "EmptyUndoBufferResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getFirstVisibleLine",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetFirstVisibleLine"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetFirstVisibleLineResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "getPasswordChar",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetPasswordChar"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "GetPasswordCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "setPasswordChar",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetPasswordChar"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "SetPasswordCharResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "",
      "undo",
      [ [SOAP::RPC::SOAPMethod::IN, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "Undo"]],
        [SOAP::RPC::SOAPMethod::OUT, "parameters", ["::SOAP::SOAPElement", "http:controls.classes.win32.server.sirius.org/", "UndoResponse"]] ],
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
