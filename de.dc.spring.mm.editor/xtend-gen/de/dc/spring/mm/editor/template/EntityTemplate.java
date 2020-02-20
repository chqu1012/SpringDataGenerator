package de.dc.spring.mm.editor.template;

import de.dc.spring.mm.Entity;
import de.dc.spring.mm.Field;
import de.dc.spring.mm.ManyToMany;
import de.dc.spring.mm.ManyToOne;
import de.dc.spring.mm.Mapping;
import de.dc.spring.mm.MappingType;
import de.dc.spring.mm.OneToMany;
import de.dc.spring.mm.OneToOne;
import de.dc.spring.mm.SpringProject;
import de.dc.spring.mm.editor.template.IGenerator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class EntityTemplate implements IGenerator<Entity> {
  @Override
  public String gen(final Entity input) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = input.eContainer();
    final SpringProject root = ((SpringProject) _eContainer);
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _basePackage = root.getBasePackage();
    _builder.append(_basePackage);
    _builder.append(".model;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.time.*;");
    _builder.newLine();
    _builder.append("import javax.persistence.*;");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      Entity _superClass = input.getSuperClass();
      boolean _tripleNotEquals = (_superClass != null);
      if (_tripleNotEquals) {
        _builder_1.append(" extends ");
        Entity _superClass_1 = input.getSuperClass();
        _builder_1.append(_superClass_1);
      }
    }
    final String baseClass = _builder_1.toString();
    _builder.newLineIfNotEmpty();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(input.getName());
    _builder.append(_firstUpper);
    _builder.append(baseClass);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Field> _fields = input.getFields();
      for(final Field object : _fields) {
        _builder.append("\t");
        final Field field = ((Field) object);
        _builder.newLineIfNotEmpty();
        {
          boolean _isIsId = field.isIsId();
          if (_isIsId) {
            _builder.append("\t");
            _builder.append("@Id");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("@GeneratedValue(strategy = GenerationType.IDENTITY)");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("private ");
        String _datatype = field.getDatatype();
        _builder.append(_datatype, "\t");
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(field.getName());
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Mapping> _mapping = input.getMapping();
      for(final Mapping object_1 : _mapping) {
        _builder.append("\t");
        final Mapping mapping = ((Mapping) object_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _mappingContent = this.getMappingContent(mapping, mapping.getMappingType());
        _builder.append(_mappingContent, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(input.getName());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Field> _fields_1 = input.getFields();
      for(final Field object_2 : _fields_1) {
        _builder.append("\t");
        final Field field_1 = ((Field) object_2);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public ");
        String _datatype_1 = field_1.getDatatype();
        _builder.append(_datatype_1, "\t");
        _builder.append(" get");
        String _firstUpper_2 = StringExtensions.toFirstUpper(field_1.getName());
        _builder.append(_firstUpper_2, "\t");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return this.");
        String _firstLower_1 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_1, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _firstUpper_3 = StringExtensions.toFirstUpper(field_1.getName());
        _builder.append(_firstUpper_3, "\t");
        _builder.append("(");
        String _datatype_2 = field_1.getDatatype();
        _builder.append(_datatype_2, "\t");
        _builder.append(" ");
        String _firstLower_2 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_2, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _firstLower_3 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_3, "\t\t");
        _builder.append("=");
        String _firstLower_4 = StringExtensions.toFirstLower(field_1.getName());
        _builder.append(_firstLower_4, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String toString() {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("StringBuilder sb = new StringBuilder(\"");
    String _firstUpper_4 = StringExtensions.toFirstUpper(input.getName());
    _builder.append(_firstUpper_4, "\t    ");
    _builder.append("(\");");
    _builder.newLineIfNotEmpty();
    {
      EList<Field> _fields_2 = input.getFields();
      for(final Field object_3 : _fields_2) {
        _builder.append("\t\t");
        final Field field_2 = ((Field) object_3);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("sb.append(\"");
        String _name = field_2.getName();
        _builder.append(_name, "\t\t");
        _builder.append(": \").append(String.valueOf(this.");
        String _firstLower_5 = StringExtensions.toFirstLower(field_2.getName());
        _builder.append(_firstLower_5, "\t\t");
        _builder.append(")).append(\",\\t\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("sb.append(\")\");");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("return sb.toString();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _getMappingContent(final Mapping mapping, final OneToOne relation) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = mapping.eContainer();
    final Entity entity = ((Entity) _eContainer);
    _builder.newLineIfNotEmpty();
    final Entity mappedEntity = relation.getMappedBy();
    _builder.newLineIfNotEmpty();
    {
      if ((mappedEntity == null)) {
        _builder.append("@OneToOne(mappedBy = \"");
        String _firstLower = StringExtensions.toFirstLower(entity.getName());
        _builder.append(_firstLower);
        _builder.append("\", fetch = FetchType.LAZY, cascade = CascadeType.");
        String _literal = relation.getCascade().getLiteral();
        _builder.append(_literal);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("private ");
        String _name = mappedEntity.getName();
        _builder.append(_name);
        _builder.append(" ");
        String _firstLower_1 = StringExtensions.toFirstLower(mappedEntity.getName());
        _builder.append(_firstLower_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("@OneToOne(fetch = FetchType.LAZY, optional = false)");
        _builder.newLine();
        _builder.append("@JoinColumn(name = \"");
        String _firstLower_2 = StringExtensions.toFirstLower(mappedEntity.getName());
        _builder.append(_firstLower_2);
        _builder.append("_id\", nullable = false)");
        _builder.newLineIfNotEmpty();
        _builder.append("private ");
        String _name_1 = mappedEntity.getName();
        _builder.append(_name_1);
        _builder.append(" ");
        String _firstLower_3 = StringExtensions.toFirstLower(mappedEntity.getName());
        _builder.append(_firstLower_3);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _getMappingContent(final Mapping mapping, final OneToMany relation) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = mapping.eContainer();
    final Entity entity = ((Entity) _eContainer);
    _builder.newLineIfNotEmpty();
    final String mappedEntity = relation.getMappedBy().getName();
    _builder.newLineIfNotEmpty();
    _builder.append("@OneToMany(mappedBy = \"");
    String _firstLower = StringExtensions.toFirstLower(entity.getName());
    _builder.append(_firstLower);
    _builder.append("\", fetch = FetchType.LAZY, cascade = CascadeType.");
    String _literal = relation.getCascade().getLiteral();
    _builder.append(_literal);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("private List<");
    _builder.append(mappedEntity);
    _builder.append("> ");
    String _firstLower_1 = StringExtensions.toFirstLower(mappedEntity);
    _builder.append(_firstLower_1);
    _builder.append("s;");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _getMappingContent(final Mapping mapping, final ManyToOne relation) {
    StringConcatenation _builder = new StringConcatenation();
    final String mappedEntity = relation.getMappedBy().getName();
    _builder.newLineIfNotEmpty();
    final String name = StringExtensions.toFirstLower(mappedEntity);
    _builder.newLineIfNotEmpty();
    _builder.append("@ManyToOne(fetch = FetchType.LAZY, optional = false)");
    _builder.newLine();
    _builder.append("@JoinColumn(name = \"");
    _builder.append(name);
    _builder.append("_id\", nullable = false)");
    _builder.newLineIfNotEmpty();
    _builder.append("private ");
    _builder.append(mappedEntity);
    _builder.append(" ");
    _builder.append(name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _getMappingContent(final Mapping mapping, final ManyToMany relation) {
    StringConcatenation _builder = new StringConcatenation();
    final String mappedEntity = relation.getMappedBy().getName();
    _builder.newLineIfNotEmpty();
    EObject _eContainer = mapping.eContainer();
    final Entity entity = ((Entity) _eContainer);
    _builder.newLineIfNotEmpty();
    {
      if ((mappedEntity == null)) {
        _builder.append("@ManyToMany(cascade = CascadeType.");
        String _literal = relation.getCascade().getLiteral();
        _builder.append(_literal);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("@JoinTable(name = \"");
        String _joinTableName = relation.getJoinTableName();
        _builder.append(_joinTableName);
        _builder.append("\",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("joinColumns = @JoinColumn(name = \"");
        String _joinColumns = relation.getJoinColumns();
        _builder.append(_joinColumns, "\t\t    ");
        _builder.append("\", referencedColumnName = \"id\"),");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t    ");
        _builder.append("inverseJoinColumns = @JoinColumn(name = \"");
        String _inverseJoinColumns = relation.getInverseJoinColumns();
        _builder.append(_inverseJoinColumns, "\t\t    ");
        _builder.append("\", referencedColumnName = \"id\"))");
        _builder.newLineIfNotEmpty();
        {
          boolean _isIsList = mapping.isIsList();
          if (_isIsList) {
            _builder.append("private List<");
            _builder.append(mappedEntity);
            _builder.append("> ");
            String _firstLower = StringExtensions.toFirstLower(mappedEntity);
            _builder.append(_firstLower);
            _builder.append("s;");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("private ");
            _builder.append(mappedEntity);
            _builder.append(" ");
            String _firstLower_1 = StringExtensions.toFirstLower(mappedEntity);
            _builder.append(_firstLower_1);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        _builder.append("@ManyToMany(mappedBy = \"");
        String _firstLower_2 = StringExtensions.toFirstLower(entity.getName());
        _builder.append(_firstLower_2);
        _builder.append("s\", fetch = FetchType.LAZY)");
        _builder.newLineIfNotEmpty();
        _builder.append("private List<");
        _builder.append(mappedEntity);
        _builder.append("> ");
        String _firstLower_3 = StringExtensions.toFirstLower(mappedEntity);
        _builder.append(_firstLower_3);
        _builder.append("s = new HashSet<>();");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String getMappingContent(final Mapping mapping, final MappingType relation) {
    if (relation instanceof ManyToMany) {
      return _getMappingContent(mapping, (ManyToMany)relation);
    } else if (relation instanceof ManyToOne) {
      return _getMappingContent(mapping, (ManyToOne)relation);
    } else if (relation instanceof OneToMany) {
      return _getMappingContent(mapping, (OneToMany)relation);
    } else if (relation instanceof OneToOne) {
      return _getMappingContent(mapping, (OneToOne)relation);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mapping, relation).toString());
    }
  }
}
