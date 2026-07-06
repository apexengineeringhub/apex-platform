# ADR-001: Standard API Response Model

## Decision

Use an immutable generic API response wrapper with a builder pattern and static factory methods.

## Reason
- Thread-safe
- Consistent API contract
- Easy to extend
- Improved readability
- Reusable
- Supports future metadata without breaking design

## Related Story
APEX-24 - Standard API Response