#!/bin/bash
          patterns=(
            '^.*\/src\/main\/resources\/org\/sonar\/l10n\/[^\/]+\/rules\/.*$'
            '^.*\/src\/main\/resources\/com\/sonar\/l10n\/[^\/]+\/rules\/.*$'
            '^.*sonarpedia\.json$'
            '^.*\.md$'
          )
          changed_files=$(git diff --name-only origin/master)
          for file in $changed_files; do
            matched=false
            for pattern in "${patterns[@]}"; do
              if [[ $file =~ $pattern ]]; then
                matched=true
                break
              fi
            done
            if [[ $matched == false ]]; then
              echo "File '$file' does not match metadata patterns."
              break
            fi
          done
          if [[ $matched == false ]]; then
            echo "All jobs will be executed"
          else
            echo "The changes contains only metadata files. The QA jobs will be skipped."
          fi
