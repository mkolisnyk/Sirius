module Sirius
  module Client
    module Win32
      module Classes
        class MainWindow < TopLevelWindow
          def initialize(client=nil, locator=nil)
            super(client, nil, locator)
          end

          def start(executable, params, workingDir)
            @client.core.window.start(@locator.hwnd, executable, params, workingDir)
          end
        end
      end
    end
  end
end