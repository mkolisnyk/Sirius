module Sirius
  module Client
    module Win32
      module Classes
        class MovableWindow < Window
          def initialize(client = nil, locator = nil, parent = nil)
            super(client, parent, locator)
          end

          def move_to(x, y)
            @client.core.window.moveTo(@locator.hwnd, x, y);
          end

          def size_to(width, height)
            @client.core.window.sizeTo(@locator.hwnd, width, height);
          end

          def minimize
            @client.core.window.minimize(@locator.hwnd);
          end

          def maximize
            @client.core.window.maximize(@locator.hwnd);
          end

          def restore
            @client.core.window.restore(@locator.hwnd);
          end

          def minimized?
            return @client.core.window.isMinimized(@locator.hwnd);
          end

          def maximized?
            @client.core.window.isMaximized(@locator.hwnd);
          end

          def restored?
            @client.core.window.isNormal(@locator.hwnd);
          end

          def close
            @client.core.window.close(@locator.hwnd);
          end
        end
      end
    end
  end
end